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

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/div_Breeding Chicken Samples'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/div_Create_GKH2EKQBDXB GKH2EKQ'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/select_Boot SwabComposite faec'), 
    'BOOT_SWAB', true)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/input_House_gwt-TextBox GKH2EK'), 
    'Test automation')

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/select_JanuaryFebruaryMarchApr'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/select_20102011201220132014201'), 
    '2020', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/select_Broiler Breeder (parent'), 
    'BB', true)

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/input_Age of flock sampled (we'), 
    '11')

WebUI.setText(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/input_No. of birds in flock_gw'), 
    '50')

WebUI.click(findTestObject('Object Repository/FSM1/NCP/Complete Inspection/Breeding Chicken Samples/Page_JClient/div_Save'))

WebUI.delay(2)

