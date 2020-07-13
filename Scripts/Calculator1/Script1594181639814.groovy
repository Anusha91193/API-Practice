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

response = WS.sendRequest(findTestObject('SOAP/Calculator/Subtract'))

WS.sendRequestAndVerify(findTestObject('SOAP/Calculator/Subtract'))

response1 = WS.sendRequest(findTestObject('SOAP/Calculator/Addition'))

WS.sendRequestAndVerify(findTestObject('SOAP/Calculator/Addition'))

WS.verifyResponseStatusCode(response, 200)

WS.verifyResponseStatusCode(response1, 200)

def result = WS.getElementText(response1, 'AddResponse.AddResult')

println(result)

//WS.containsString(response1, 'AddResponse.AddResult', false)//

def notequal = WS.verifyNotEqual('response', 'response1', FailureHandling.STOP_ON_FAILURE)

println(notequal)

def concatinate=WS.concatenate(((['anu', 'anusha']) as String[]))
println(concatinate)



