# awesome-calculator-test-repo

This repository meant for code challenge.

**Note**: Project has some additional unused dictionaries and script files. These are added to give the skeleton view of the automation framework.

## Short summary
- Dear team, Welcome to the test automation ecosystem of awesome-calculator application
  
  This is a TDD gradle project developed using Groovy. Please go through the below details to understand the process of development and usage.

## First steps
1. git clone 
2. Navigate to `/src/tests/src`
3. Explore the repo

## What do I need on my machine to run the tests ?
1. [DOCKER](https://www.docker.com/)  (only if you want to run the tests inside a container)
2. [JDK](https://www.oracle.com/java/technologies/javase-downloads.html) - 11+ recommended
3. [GRADLE](https://gradle.org/) - 7.1.1+ recommended
4. [GOOGLE-CHROME](https://www.google.com/chrome/)

## What tests covered under this project ?
- Smoke
- Sanity
- Contract
- Regression

## Where can I find the test cases ?
- You can find them under `/src/test/groovy/`

## How to run the test execution ?
There are multiple ways to execute them
**Note**: The application need to be up and running before running tests.To run the awesome-calculator application locally please follow the steps in `root/README.md` file

1. Run tests inside docker container
  - Find the `Dockerfile` under root folder
  - Run the `Dockerfile`
  - or from terminal run `docker build` on the root path

2. Run without docker (from gradle)
  - run `gradle clean build` or `gradle clean test` from the tests root folder

3. Run without docker (from xml file)
  - Navigate to `/src/test/resources/suites/`
  - There you can find multiple XML files
  - Choose and run the xml file

## Framework Approach
- `Page object model` for GUI
- `POJO` for API
- Common API function calls (POST/PUT/GET/...)  are kept independent, so different API's can share them
- Implementation methods on api request and responses maintained separately
- API endpoints maintained in separate class file
- API files maintained with version number
- Test run groups declared in a separate class, so we can manage them effectively
- Test execution managed using XML files. This can be passed as an environment variable or default should run all test cases (full.xml)
- Used data providers classes to maintain test data. This way, we just need to add additional test data values instead of writing a new test.
- 'Allure' is used for a documentation and reporting

## Technical details

- Automation          : API, GUI
- Tools               : Rest assured, selenium
- Scripting language  : Groovy
- Build tool          : Gradle

## Implementation included
- TDD (TestNG)
- Docker
- Logging (Allure)
- HTML reporting (Allure)
- Version control (git)

### Project Structure:

    - Root\
       - src\
         - main\
            - groovy
              - api
               - awesomeCalulator
                  - basic
                  - request
                  - response
               - gui
                - awesomeCalulator
                  - pageObjects
               - utils             
            - resources\
               - schemas
              - confifuration file
         - test\
            - groovy\
               - awesomeCalculator\
                  - api
                  - gui
                  - usecases
            - resources\
               - suites
                  - full.xml
                  - api.xml
                  - gui.xml
                  - smoke.xml
                  - sanity.xml
                  - regression.xml
                  
## paths
 - Test cases       : `/src/test/groovy/`
 - Test suites      : `/src/test/resources/suites/`
 - Test screenshots : `/screenshots`
 - Test reports     : `/build/test-results/test/*.xml`

###### Scripting best practices that need to be followed:
    - Class names: camel cassing
    - method,variable names: pascal cassing
	- Documentation: @story, @step, document comments
	- Logging & Reporting: Allure html test report
	- 1 liner indentation
	- Suite setup and teardown mandatory for every test file
	- Config/variable/data files usage
