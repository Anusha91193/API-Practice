import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'store the response in - response variable'
response = WS.sendRequestAndVerify(findTestObject('REST/GET'))

'verify the element count from the response variable'
WS.verifyElementsCount(response, 'data', 6)

'verify whether the response contains the string "Michael"'
def string = WS.containsString(response, 'Michael', false)

'print the value stored in string'
println(string)

'get the first name of data[0] from the response\r\n\r\ni.e get the first name of first record from the response '
def firstname = WS.getElementPropertyValue(response, 'data[0].first_name')

'print the first name'
println(firstname)

'verify the value in data[0] is matching with string Michael -\r\n Element property -  data[0] \r\n Value -  Michael'
def name = WS.verifyElementPropertyValue(response, 'data[0].first_name', 'Michael')

'print the value whcih is present in data[0]'
println(name)

'get the no of records in response'
count = WS.getElementsCount(response, 'data')

'print the value of no of records present in response'
print(count)

def equal = WS.verifyEqual(count, '6')

print(equal)

def greaterthan = WS.verifyGreaterThan(count, '4')

print(greaterthan)

def notequal = WS.verifyNotEqual(count, '7')

println(notequal)

WS.getElementText(response, 'email')

