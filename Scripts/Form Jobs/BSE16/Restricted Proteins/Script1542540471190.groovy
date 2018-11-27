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

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/div_Restricted ProteinsAuthori'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Are restricted proteins (1)'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Which restricted protein'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Supply further details o_2'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_No_radio_group_4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/select_YesNo'), 'YES', 
    true)

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Registration number of b'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_No_gwt-uid-127'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_How are the restricted p'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_NA_radio_group_6'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_NA_radio_group_7'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_NA_radio_group_8'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_NA_radio_group_9'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_NA_radio_group_10'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/input_Commentsfurther details_'))

WebUI.click(findTestObject('Object Repository/FSM1/BSE16/Page_JClient/Page_JClient/div_Save - Generic'))

WebUI.delay(2)

