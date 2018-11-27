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

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_Livestock on Farm'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Ruminants on farm_radio_'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Stock types kept on prem'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Non-ruminants on farm_ra'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Poultry_gwt-uid-157'))

WebUI.click(findTestObject('FSM1/BSE16/Page_JClient/div_Save - Generic'))

WebUI.delay(2)

