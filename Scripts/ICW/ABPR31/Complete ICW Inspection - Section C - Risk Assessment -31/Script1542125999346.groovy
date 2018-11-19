import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/div_Section C Risk Assessment'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/select_3 - Cat 3 material and'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/select_0 - Very low throughput'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/select_0 - No product entering'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/select_0 - Not required or com'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/select_0 - Fully compliant iss'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/select_BienniallyAnnuallyQuart'), 
    'Annually', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section C/Page_JClient/div_Save'))

