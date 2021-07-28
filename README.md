# Awesome factorial application (v2)

Welcome to the awesome factorial updated repository. The newer version of the application, protected by tests and ensures high quality

Hej Team,

As I understood the problem, that awesome-llc has been operational without any test/QA

At first, I wanted to create a continous integration solution (some automation tests + exploratory tests which QA team can test on build releases) but as I can see the application don't have an unit, integration tests and build is running without and tests I have decided to provide a continous delivery solution. please find the below metnioned details to review my solution

# Solution details

**Test repo**: `/src/tests/src`

**Test repo readme**: `/src/tests/README.md`

# Scalability
On a first impression, the solution might look an overkill for simple application, but as a new feature is getting added to the application and company's thinking to expand more, I designed it keeping horizontal scaling in mind

# CI/CD sample
I have also added a sample CI/CD script that you can find in the `githubActions` tab of the repo 

**Note**: To include smoke tests in the build process, I have updated the `docker-compose.yml` file, hope you guys don't mind

**Detailed information of test repo can be found under `/src/tests/README.md`**

## Contents

1. [💻 Requirements](#requirements)
1. [🚧 Roadmap](#roadmap)
1. [🚀 How to run](#how-to-run)
1. [🕹 How to use](#how-to-use)
1. [🏷 Versioning](#versioning)
1. [🔐 Security](#security)
1. [📜 License](#license)

## Requirements

- [🐳 Docker](https://www.docker.com/get-started)

## Roadmap

Next features to implement can be found in milestone [2.0.0](https://github.com/rui-costa/awesome_factorial_application/milestone/1)

The full roadmap can be found [here](https://github.com/rui-costa/awesome_factorial_application/milestones)

## How to run

- MacOS and LINUX

```
./run
```

- Windows

```
docker-compose build --no-cache --parallel
docker-compose up
```

## How to use

Navigate to http://localhost:8080 and enjoy your calculator

## Versioning

Versioning follows the [Semantic Versioning](https://semver.org/) standard.

## Security

Running code from unknown sources always caries some risk. Luckily, this code is simple to understand and can be easily validated. Never the less, the responsibility is yours.

## License

The source code for this project is released under the [MIT License](https://mit-license.org/).
