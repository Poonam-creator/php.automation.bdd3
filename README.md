# php.automation.bdd3

#My Project going Automate site called
	http://automationpractice.com/index.php

Developing Cucumber Bdd Framework from Scratch

 First step
	
	Start intelliJ integrated development environment
Create Maven  Project
Add required dependencies

In this project I m automating UI Of this application, according to that I have added
Following dependencies in Pom.xml file.


 <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.11</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>3.141.59</version>
    </dependency>

    <!-- To support browser binary files-->
    <dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>3.7.1</version>
    </dependency>

    <!-- Asserts -->
    <dependency>
      <groupId>org.hamcrest</groupId>
      <artifactId>hamcrest-all</artifactId>
      <version>1.3</version>
      <scope>test</scope>
    </dependency>
    <!-- Cucumber -->
    <dependency>
      <groupId>info.cukes</groupId>
      <artifactId>cucumber-junit</artifactId>
      <version>1.2.5</version>
      <scope>test</scope>
    </dependency>
    <dependency>
      <groupId>info.cukes</groupId>
      <artifactId>cucumber-java</artifactId>
      <version>1.2.5</version>
      <scope>test</scope>
    </dependency>

Then I decided one feature to be automated.
Starting with one feature if it works correctly then I can automate rest all features.

Firstly I created Cucumber Feature File

New directory by clicking on test folder
In that directory
Created new file Named search.feature
In this file write scenario using gherkin language for that particular feature.

Once scenario is done next step to implement step definition file.
Right click on feature file and generate the code for stepdefinition.
Going forward created one package by right cliking on test java folder.

Named that newly created folder as sep_definition
Inside sep_defination folder created Java class named that Step_def
For implementation of test Steps which are generated by running feature file.
     Copy the steps code from feature file console window and pasted into newly created Step_def java class.
According to feature file i have writen my selenium code for testing purpose.
Included assertion as without assertion test is not valid
And we need to check expected with actual.

Next step in this process is to create one more
Package called runner.
In this created one java class named Run_Test
Without Run_test we can not run our test, and also to generate the output and reports.
In Run_test class i have added annotations.
Above the class.
@Run With (Junit)
 @Cucumber options (features=" path to feature file",
DryRun=false)

By doing dryRun true i have check my all steps are implemented correctly weather i have missed any steps.
Next i have done dryRun false and by running RunTest class i have executed test.
As expected my test got pass.
