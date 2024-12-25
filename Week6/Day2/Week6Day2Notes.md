
# For Sequential Execution:
    - Driver declaration should be static
    - Create 2 testcases inside testcases package
         runLogin
         runCreateLead
    - Select the required testcases and convert into testng.xml file
    - Finally, run the testcases together sequentially from testng.xml file

# For Parallel Execution:
        - Remove static keyword in PSM
        - Create parameterized constructor in each pages
           public LoginPage(ChromeDriver driver) {
		        this.driver=driver;
	         }
        - Pass driver value in each Constructor initialization in each pages and testcases

# POM with Excel Integration:
   - Create data folder and have the excelsheets inside 
        Login
        CreateLead
   - Create a package called utils and have the ReadExcel java class inside
   - Create sendData() and annotate with DataProvider and call the readExcel() and return 
   - Replace all the hardcoded data with input arguments in the required pages
   - In the testClasses, use dataProvider attribute to receive the data 
     and pass input arguments in the test method.
   - Create setValues() in each testclass to mention the fileName and annotate with @BeforeTest 

       
       