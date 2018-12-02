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

WebUI.click(findTestObject('FSM1/Release 21/Notes/Page_JClient/div_Data Capture'))

WebUI.delay(2)

WebUI.click(findTestObject('FSM1/Release 21/Notes/Page_JClient/div_Notes'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('FSM1/Release 21/Notes/Page_JClient/td_0Fully compliant issues rap'), 0)

WebUI.verifyElementPresent(findTestObject('FSM1/Release 21/Notes/Page_JClient/td_0No product entering livest'), 0)

WebUI.verifyElementPresent(findTestObject('FSM1/Release 21/Notes/Page_JClient/td_0Not required or complete a'), 0)

WebUI.verifyElementPresent(findTestObject('FSM1/Release 21/Notes/Page_JClient/td_0Very low throughput1 tonne'), 0)

WebUI.verifyElementPresent(findTestObject('FSM1/Release 21/Notes/Page_JClient/td_3Cat 3 material  catering w'), 0)

