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

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/div_Section A Summary of Inspe'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Yes_radio_group_1'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Yes_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Yes_radio_group_3'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Waste Originator Details'))

WebUI.setText(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Local AuthorityPort Heal'), 'Test Automation')

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Yes_radio_group_4'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Yes_radio_group_5'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Yes_radio_group_6'))

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/input_Is this inspection a fin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/select_(a) Continue with curre'), 
    'Continue with current approval', true)

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/div_Save'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/div_Section A Summary of Inspe'), 
    2)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/div_Section A Summary of Inspe'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete 31 Section A/Page_JClient/input_Chargeable time (minutes'), 
    '12')

WebUI.click(findTestObject('Object Repository/FSM1/ABPR42 - Section A/Page_JClient/div_Save'))

WebUI.delay(3)

