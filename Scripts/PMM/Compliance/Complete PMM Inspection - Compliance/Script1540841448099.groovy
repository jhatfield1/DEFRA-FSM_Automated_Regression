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

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/div_Compliance'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Current crop compliant_r'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Previous crop compliant_'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Previous crop compliant__1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Current crop compliant_r_1'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Previous crop compliant__2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Current crop compliant_r_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Previous crop compliant__3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Current crop compliant_r_3'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Previous crop compliant__4'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Previous crop compliant__5'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/input_Current crop compliant_r_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/select_CompliantNot Compliant'), 
    'Compliant', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/select_Fully compliant Fully c'), 
    'Fully compliant', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/textarea_Recommended Action -'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/select_RoutineFollow UpNo furt'), 
    'No further visits', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/textarea_Reason for no further'), 
    'Test automation')

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/img_Inspector Signature_gwt-Im'))

WebUI.click(findTestObject('FSM1/Complete PMM Inspection/Compliance/Page_JClient/div_Unable To Sign_Inspector'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/img_Person Seen Signature_gwt-'))

WebUI.click(findTestObject('FSM1/Complete PMM Inspection/Compliance/Page_JClient/div_Unable To Sign_Person'))

WebUI.click(findTestObject('Object Repository/FSM1/Complete PMM Inspection/Compliance/Page_JClient/div_Save'))

