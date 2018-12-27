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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://kirona-def-6.kirona.com/jmprep/login?postLoginUrl=%2Fjmprep%2Fui&postLoginQuery=%23%21fwc#!loginView')

WebUI.setText(findTestObject('Object Repository/A/Page_Job Manager Login/input_User_gwt-uid-3'), 'jon.hatfield')

WebUI.setEncryptedText(findTestObject('Object Repository/A/Page_Job Manager Login/input_Password_gwt-uid-5'), 'x7VPQlF3Im+e+3AuW6khww==')

WebUI.sendKeys(findTestObject('Object Repository/A/Page_Job Manager Login/input_Password_gwt-uid-5'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/A/Page_JM Control Centre/input_Recents_v-textfield v-wi'), '97698')

WebUI.sendKeys(findTestObject('Object Repository/A/Page_JM Control Centre/input_Recents_v-textfield v-wi'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/div_Nav'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/div_Lines'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/span_View'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/span_Fattening Turkey Samples'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/div_House10MonthNovemberYear20'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/span_House'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/span_Fattening Turkey Samples'))

WebUI.doubleClick(findTestObject('Object Repository/A/Page_JM Control Centre/span_Fattening Turkey Samples'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/span_10 11 2019'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/span_House'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/div_House10MonthNovemberYear20_1'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/div_House10MonthNovemberYear20_2'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/div_House10MonthNovemberYear20_3'))

WebUI.click(findTestObject('Object Repository/A/Page_JM Control Centre/div_House10MonthNovemberYear20_4'))

