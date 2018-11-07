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

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/div_Section B Inspection Detai'))

WebUI.delay(3)

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/Page_JClient/Operator'), 'test automation')

WebUI.setText(findTestObject('FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/Page_JClient/SafeEndUse'), 'test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/input_Records_radio_group_19'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/input_If records have not been'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/input_Not Checked_radio_group_'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/input_Not Checked_radio_group__1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/input_Not Checked_radio_group__2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/input_(a) Back trace (complete'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/input_Yes_radio_group_25'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete ABP Inspection/ABPR26a/Page_JClient/div_Save'))

