# This is a variation on a lightning talk I gave at the LSCC circa 2018.
# Updated for an LJC lightning talk in July 2020.

## Command Line:
mvn clean package org.pitest:pitest-maven:mutationCoverage

Different mutators: 
http://pitest.org/quickstart/mutators/

## Descartes Mutation Engine
https://github.com/STAMP-project/pitest-descartes

mvn clean package org.pitest:pitest-maven:mutationCoverage -DmutationEngine=descartes
