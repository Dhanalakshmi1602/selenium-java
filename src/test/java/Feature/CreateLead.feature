Feature: Create a lead in leaftaps application

Background:
Given launch the browser
And Maximize the browser
And Load the Url

Scenario Outline: TC001 positive flow for creationg a lead
Given Enter the username as Demosalesmanager
And Enter the Password as crmsfa
When Click on Login button
Given Click on Crmsfa
And click on lead button
And Enter the company name as <Companyname>
And Enter the Firstname as <Firstname> 
And Enter the Lastname as <Lastname>
When Click on create lead button 

Examples:
|Companyname|Firstname|Lastname|
|TechM|Dhana|Lakshmi|
|ICUMed|Rahul|Katte|
|Google|Nahul|Katte|
