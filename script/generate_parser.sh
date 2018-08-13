#!/bin/bash
FN=$2;
echo "
 extends FilterParser<${FN}Filter, ${FN}> { 

     @Override 
     public Checker<${FN}> createChecker(${FN}Filter annotation, Finder finder) { 
         UnionChecker<${FN}> unionChecker = new UnionChecker<>();
                 "
                 cat $1 | grep '  \* @see' | awk '{ print "         "$3" "$4" = annotation."$4"(); \n if("$4".value().isActive()) { \n unionChecker.add(in -> Optional.ofNullable(in.get"toupper(substr($4,1,1)) substr($4,2)"()), finder.find("$4"));}" }'

echo "
        return unionChecker;
        }


    @Override
    public Class<${FN}Filter> getAnnotationClass() {
         return ${FN}Filter.class;
     }

 }
"
