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

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_Former Foodstuffs'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Are former foodstuffs us'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Which former foodstuffs'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Kitchenrestaurant_gwt-ui'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Food manufacturer_radio_'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_NA_radio_group_6'))

WebUI.click(findTestObject('FSM1/BSE16/Page_JClient/div_Save - Generic'))

