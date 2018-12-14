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

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/div_Section A Summary of Inspe'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_5'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_6'))

WebUI.selectOptionByValue(findTestObject('FSM1/Complete 31 Section A/Page_JClient/Structure'), 'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete 31 Section A/Page_JClient/Operation'), 'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete 31 Section A/Page_JClient/Records'), 'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete 31 Section A/Page_JClient/SRM'), 'S', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_15'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_16'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/select_(a) Continue with curre'), 
    'Continue with current approval', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_17'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_18'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Yes_radio_group_19'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/div_Save'))

WebUI.delay(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/div_Section A Summary of Inspe'), 
    0)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/div_Section A Summary of Inspe'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Chargeable time (minutes'), 
    '12')

WebUI.click(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/div_Save'))

