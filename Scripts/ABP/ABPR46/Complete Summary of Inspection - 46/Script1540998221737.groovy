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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/div_ABPR46 - Summary of Inspec'))

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/select_Structure'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/select_Operation'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/select_Records'), 
    'S', true)

WebUI.selectOptionByValue(findTestObject('FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/select_SRM'), 'S', 
    true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/input_Yes_radio_group_154'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/select_(a) Maintain approval f'), 
    'Maintain approval for export', true)

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/input_Yes_radio_group_155'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/input_Are copies of all releva'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/input_Yes_radio_group_157'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR46 and others/Page_JClient/div_Save'))

