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

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_On farm feeding of milk mi'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Is there on farm feeding'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_No_radio_group_13'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Registered milk processi'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Unregistered milk proces'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Retail stores or superma'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_concat(Another farm whic'))

WebUI.click(findTestObject('FSM1/BSE16/Page_JClient/div_Save - Generic'))

WebUI.delay(3)

