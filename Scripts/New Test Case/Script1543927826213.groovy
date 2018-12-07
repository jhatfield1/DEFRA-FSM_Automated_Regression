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

WebUI.click(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/label_Manually Allocate as an'))

WebUI.click(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/div_Owner_v-filterselect-butto'))

WebUI.setText(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/input_Owner_gwt-uid-304'), 
    'test')

WebUI.click(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/span_Test Inspector'))

WebUI.setText(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/input_Owner_gwt-uid-304'), 
    'Test Inspector')

WebUI.setText(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/input_From date_gwt-uid-306'), 
    '07-D1ec-2018')

WebUI.setText(findTestObject('Object Repository/JM_8918/New/Page_JM Control Centre/Page_JM Control Centre/input_Due date_gwt-uid-308'), 
    '10-1Dec-2018')

