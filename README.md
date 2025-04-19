## Cucumber TestNG Project for Danube Webshop Book Search Functionality

Welcome to the **Cucumber_Testng_Project** repository! This project is designed to help you understand and implement **Cucumber BDD** tests with **TestNG** for automating the **book search functionality** of the **Danub Webshop**. It uses **Cucumber** for behavior-driven development (BDD) with **TestNG** for test execution. 

## Table of Contents
1. [Repository Overview](#repository-overview)
2. [Technologies Used](#technologies-used)
3. [Installation Instructions](#installation-instructions)
4. [Folder Structure](#folder-structure)
   - [Source Code](#source-code)
   - [Resources](#resources)
5. [Contributing](#contributing)
6. [License](#license)
7. [Acknowledgments](#acknowledgments)

## Repository Overview

This repository focuses on automating the **book search functionality** of the **Danub Webshop**. It integrates **Cucumber** with **TestNG** for running the tests and generating detailed reports using **Extent Reports**. The test scenarios are written in **Gherkin** syntax and the execution is powered by **TestNG**.

## Technologies Used

- **Java 8+** (Required for running the repository)
- **Cucumber** (Behavior Driven Development framework)
- **TestNG** (Test execution framework)
- **Selenium** (WebDriver for browser automation)
- **Extent Reports** (Reporting framework for test execution)

## Installation Instructions

To set up this repository on your local machine, follow the steps below:

### Prerequisites:
1. **Java 8+**: Make sure you have Java 8 or above installed on your system.
2. **Git Bash**: You will need **Git Bash** (or any terminal of your choice) to clone the repository.
3. **Maven**: Ensure Maven is installed to handle project dependencies.
4. **IDE**: Use **Eclipse**, **IntelliJ IDEA**, or **NetBeans** to work with this repository.

### Steps to Clone and Set Up:
```plaintext
1. **Clone the repository**:
   git clone [https://github.com/YourUsername/Cucumber_Testng_Project.git](https://github.com/AbhijitPisal1/Cucumber_Testng_Project.git)
   cd Cucumber_Testng_Project
2. Install the required dependencies:
   mvn clean install
3. Run the tests using Maven:
   mvn test
```

This will install all necessary dependencies (as defined in the `pom.xml` file), including **Selenium**, **Cucumber**, **TestNG**, and others.

## Folder Structure

The repository is organized into the following folders:

### Source Code
- **src/test/java**: Contains Java files for test execution.
  - **runners folder**: Contains the runner files for running tests, such as:
    - `BookSearchRunner.java`: Standard runner to execute tests.
    - `RerunRunner.java`: Runner for rerunning failed tests.
  - **stepDefinitions folder**: Contains Java files for step definitions using **TestNG** and **Cucumber** annotations. It includes hooks and Java methods that define the test steps for the book search functionality.

### Resources
- **src/test/resources**: Contains feature files written in **Gherkin** syntax for the book search functionality.
  - **features folder**: Contains `bookSearch.feature` with the test scenarios in Gherkin syntax.
  - **extent.properties**: Configures the **Extent Reports** functionality to generate reports.

## Contributing

We welcome contributions! If you'd like to contribute, follow these steps:

1. **Fork the repository**: Create a fork of the repository to your own GitHub account.
2. **Clone your fork**: Clone the forked repository to your local machine.
3. **Create a branch**: Make changes in a new branch for clarity and separation of concerns.
   ```plaintext
   git checkout -b feature/your-feature
   ```
4. **Commit changes**: After making the necessary changes, commit them with a meaningful commit message.
   ```plaintext
   git add .
   git commit -m "Added new feature"
   ```
5. **Push changes**: Push your changes to your forked repository.
   ```plaintext
   git push origin feature/your-feature
   ```
6. **Create a Pull Request**: Go to your forked repository on GitHub and create a Pull Request to merge your changes into the main repository.

Please ensure to follow the repository's coding standards and test your changes before submitting a PR.

## License

This project is not licensed. All rights are reserved by the author.

## Acknowledgments

- Special thanks to the **Cucumber** community for providing a robust BDD framework.
- Thanks to the **Selenium** community for creating a powerful tool for browser automation.
- This repository is created to help beginners learn and practice test automation using **Cucumber** and **TestNG**.

Feel free to reach out if you have any questions or need further clarification. Happy learning and automating!
