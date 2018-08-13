#!/bin/bash
cat $1 | grep '  \* @see' | awk '{print $3" "$4"() default @"$3"(AnnotationState.OFF);\n"}'


