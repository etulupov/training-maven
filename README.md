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

##Task-to-profile mapping##
Создать проект, который для сборки будет использовать Maven:

1. Проект должен быть мультимодульным. Один из модулей должен зависить от другого
1. `test-calculator` & `test-solver` => В проекте должно присутствовать несколько профилей. Один из Профилей должен запускать только тесты из конкретного пакета/директории (интеграционные тесты) из одного модуля.
1. Проект должен содержать тесты для каждого модуля с использованием jUnit 4.* версии
1. Модули должны иметь в зависимостях библиотеки (1 общая для всех модулей и 1 уникальная для каждого).
1. Проект должен содержать профиль с условием в секции <activation>.

Проект должен уметь.

1. `build-sign` => Собирать скомпилированный архив
1. `build-sign-source` => Собирать архивы с исходниками (*.java,*.xml ...)
1. `check` => При наличии ошибок в checkstyle - билд должен падать

Опционально:

1. `docs` => Генерировать сайта для проекта с помощью отдельного профиля . Без агрегации. Должен содержать информацию о testresult, codecoverage, javadoc, pmd и checkstyle отчеты.
