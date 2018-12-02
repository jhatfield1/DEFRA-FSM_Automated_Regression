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

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/div_EstablishmentProduction In'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/select_ 15000 tonnes15000-1500'), '15000150000_TONNES', 
    true)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Non-ruminant feed only_r'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Ruminant feed only_radio'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Ruminant and non-ruminan'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Only Non-ruminant feed w'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Ruminant and Non-ruminan (1)'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_No_radio_group_10'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Is production single str'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Is production dual strea'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Is this a blending plant'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_No_radio_group_14'))

WebUI.setText(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Registration no. (if app'), '1234')

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/input_Registration no. (if app_1'))

WebUI.click(findTestObject('FSM1/BSE16/Page_JClient/div_Save - Generic'))

WebUI.delay(2)

