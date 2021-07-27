//environment variables
environment = System.getenv("TEST_ENVIRONMENT") ?: "local"
timeout = System.getenv("TIMEOUT") ?: "30000"

//Browser Setup
browser = System.getenv("BROWSER") ?: "chrome"
headless = System.getenv("HEADLESS") ?: false
failScreenShotPath = System.getenv("FILE_SCREENSHOT_PATH") ?: "screenshots//"

environments {
    local {
        awesomeCalculatorAPIURL = "http://localhost:8080"
        awesomeCalculatorAPPURL = "http://localhost:8080"
    }

    prod {
        awesomeCalculatorAPIURL = "http://localhost:8080"
        awesomeCalculatorAPPURL = "http://localhost:8080"
    }
}
