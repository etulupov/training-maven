#Maven Training project#

##Overview##
The project contains two submodules:

* calculator
* solver

##Available profiles##

###check###
Checks the source code with `pmd` and `checkstyle` plugins

###build-sign###
Generates signed jars

###build-sign-source###
Generates signed jars and jars with sources

###docs###
Generates project site (activated by default)

1. `mvn site:site`
1. `mvn site:stage -DstagingDirectory={your-site-directory}` (For example: `mvn site:stage -DstagingDirectory=/home/username/project`)

###test-calculator###
Runs tests for calculator module

###test-solver###
Runs tests for solver module