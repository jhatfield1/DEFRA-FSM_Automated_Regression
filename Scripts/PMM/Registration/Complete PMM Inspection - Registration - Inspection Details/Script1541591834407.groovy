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

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/div_Inspection Details'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/input_Yes_radio_group_2'))

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/input_Yes_radio_group_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/select_RegisterRemedial action'), 
    'Register', true)

WebUI.setText(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/textarea_Recommended Action -'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/select_Routine'), 
    'Routine', true)

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/img_Inspector Signature_gwt-Im'))

WebUI.click(findTestObject('FSM1/Complete PMM Inspection/Registration/Page_JClient/Inspector_Unable To Sign'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/img_Person Seen Signature_gwt-'))

WebUI.click(findTestObject('FSM1/Complete PMM Inspection/Registration/Page_JClient/Person_Unable To Sign'))

mydate = new Date()

tomorrow = mydate.next()

formattedDate = tomorrow.format('dd/MM/yyyy')

WebUI.sendKeys(findTestObject('FSM1/Complete PMM Inspection/Registration/Page_JClient/input_Next inspection due_GKH2'), 
    formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/Create PMM Inspection/Registration - Inspection Details/Page_JClient/div_Save'))

