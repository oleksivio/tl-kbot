package io.github.oleksivio.tl.kbot.core.core.controller.handler.check.impl

import io.github.oleksivio.tl.kbot.core.core.controller.handler.check.Validator
import java.util.*
import java.util.regex.Pattern

class StringValidator(startWith: Array<String>,
                      equalsWith: Array<String>,
                      endWith: Array<String>,
                      contains: Array<String>,
                      private val regExp: String,
                      notStartWith: Array<String>,
                      notEndWith: Array<String>,
                      notContains: Array<String>) :
    Validator<String> {

    private val matchItems = ArrayList<ValidateItem>()
    private val nonMatchItems = ArrayList<ValidateItem>()

    init {

        if (startWith.isNotEmpty()) {
            matchItems.add(
                ValidateItem(
                    startWith,
                    { obj, prefix -> obj.startsWith(prefix) })
            )
        }
        if (equalsWith.isNotEmpty()) {
            matchItems.add(
                ValidateItem(
                    equalsWith,
                    { obj, anObject -> obj == anObject })
            )
        }
        if (endWith.isNotEmpty()) {
            matchItems.add(
                ValidateItem(
                    endWith,
                    { obj, suffix -> obj.endsWith(suffix) })
            )
        }
        if (contains.isNotEmpty()) {
            matchItems.add(
                ValidateItem(
                    contains,
                    { obj, s -> obj.contains(s) })
            )
        }

        if (notContains.isNotEmpty()) {
            nonMatchItems.add(
                ValidateItem(
                    notContains,
                    { obj, s -> obj.contains(s) })
            )
        }
        if (notEndWith.isNotEmpty()) {
            nonMatchItems.add(
                ValidateItem(
                    notEndWith,
                    { obj, suffix -> obj.endsWith(suffix) })
            )
        }
        if (notStartWith.isNotEmpty()) {
            nonMatchItems.add(
                ValidateItem(
                    notStartWith,
                    { obj, prefix -> obj.startsWith(prefix) })
            )
        }
    }

    override fun invoke(checkedValue: String): Boolean {

        if (!matchItems.isEmpty() && matchItems.none { it.isMatch(checkedValue) }) {
            return false
        }

        if (!nonMatchItems.isEmpty() && nonMatchItems.any { it.isMatch(checkedValue) }) {
            return false
        }

        return regExp.isEmpty() || Pattern.matches(regExp, checkedValue)

    }

    private class ValidateItem internal constructor(private val strings: Array<String>,
                                                    private val checker: (arg: String, condition: String) -> Boolean) {

        internal fun isMatch(arg: String): Boolean {
            return strings.any { checker(arg, it) }
        }

    }

}
