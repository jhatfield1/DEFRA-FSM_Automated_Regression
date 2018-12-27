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

SampleType = WebUI.modifyObjectProperty(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/div_Breeding Chicken Samples'), 
    'text', 'equals', SampleType, true)

WebUI.click(SampleType, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/div_Create_GFNJNYPCEYB GFNJNYP'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/input_House_gwt-TextBox GFNJNY'), 
    '10')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_JanuaryFebruaryMarchApr'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_20102011201220132014201'), 
    '2019', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_Turkey Fattener flockTu'), 
    'TPTURKEY_FATTENING_FLOCKS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_Turkey Fattener flockTu'), 
    'TPTURKEY_PARENT_FLOCKS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_Turkey Fattener flockTu'), 
    'TGPTURKEY_GRANDPAREN_FLOCKS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_Turkey Fattener flockTu'), 
    'TGGPTUR_GREAT_GRANDP_FLOCKS', true)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/input_Is this the first sampli'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/input_Age of flock sampled (we'), 
    '12')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/input_No. of birds in flock_gw'), 
    '120')

mydate = new Date()

formattedDate = mydate.format('dd/MM/yyyy')

WebUI.sendKeys(findTestObject('FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/input_Intended date of slaught'), 
    formattedDate)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/input_Flock treated with antib'))

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/textarea_Details of antibiotic'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_5 pairs boot swabs1 pai'), 
    '5_PAIRS_BOOT_SWABS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_5 pairs boot swabs1 pai'), 
    '1_PAIR_BOOT_SWABS_AND_1DUST', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_5 pairs boot swabs1 pai'), 
    '2_PAIRS_BOOT_SWABS', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/select_5 pairs boot swabs1 pai'), 
    '4_HAND_FAECAL_SWABS', true)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Turkey Samples/Page_JClient/div_Save'))

