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

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/div_Edit attributes'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/input_Trading Name_gwt-TextBox'), 'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/select_Compliance (Schedule  A'), 
    'COMPLIANCE', true)

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/input_Production Type_gwt-uid-'))

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/div_Signatures  Remarks'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/img_Inspector Signature_gwt-Im'))

WebUI.click(findTestObject('FSM1/EMI Hygiene1/Page_JClient/div_Unable To Sign_Inspector'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/img_Recipient Signature_gwt-Im'))

WebUI.click(findTestObject('FSM1/EMI Hygiene1/Page_JClient/div_Unable To Sign_Recipient'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/input_Recipient Name_gwt-TextB'), 'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/EMI Hygiene1/Page_JClient/input_Recipient Position_radio'))

WebUI.click(findTestObject('FSM1/EMI Hygiene1/Page_JClient/div_Save_Sig'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/EMI Hygiene1/Page_JClient/div_Save_edit'))

WebUI.delay(2)

