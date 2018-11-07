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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/div_Section A Summary of Inspe'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_5'))

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/Page_JClient/Operation'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/Page_JClient/Records'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/Page_JClient/Structure'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/Page_JClient/SRM'), 
    'S', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_14'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_15'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/select_(a) Continue with curre'), 
    'Continue with current approval', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_16'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_17'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Yes_radio_group_18'))

WebUI.click(findTestObject('Object Repository/Complete ABPR37 - Section B/Page_JClient/Page_JClient/input_Yes_radio_group_19'))

WebUI.setText(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/input_Chargeable time (minutes'), 
    '10')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR34a - Inspection B/ABPR34a - Section A/Page_JClient/div_Save'))

