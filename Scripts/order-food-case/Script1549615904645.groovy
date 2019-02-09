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

WebUI.openBrowser(GlobalVariable.URL)

WebUI.maximizeWindow()

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.click(findTestObject('button_customer'))

WebUI.switchToWindowUrl(GlobalVariable.URL_Pemesanan)

WebUI.waitForPageLoad(GlobalVariable.timeout)

WebUI.waitForElementPresent(findTestObject('paket_recommend_santap_siang_button'), GlobalVariable.timeout_E)

WebUI.scrollToElement(findTestObject('paket_recommend_santap_siang_button'), 0)

WebUI.click(findTestObject('paket_recommend_santap_siang_button'))

WebUI.click(findTestObject('date_order_button'))

WebUI.click(findTestObject('date_picker/day_20_text'))

WebUI.click(findTestObject('date_picker/day_22_text'))

WebUI.click(findTestObject('pesan_paket_button'))

WebUI.setText(findTestObject('login/user_textfield'), 'okta')

WebUI.setText(findTestObject('login/password_field'), 'tes123456')

WebUI.click(findTestObject('login/masuk_button'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Okta', false)

WebUI.click(findTestObject('pesan_paket_button'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('request_order/radio_button_template'))

WebUI.click(findTestObject('request_order/lanjut_button'))

WebUI.click(findTestObject('form_pesanan/pilih_catering_button'))

WebUI.setText(findTestObject('form_pesanan/catering_textfield'), 'D Artz')

//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('form_pesanan/catering_index'))

WebUI.setText(findTestObject('form_pesanan/kitchen_name_textfield'), 'D Artz')

//WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('form_pesanan/kitchen_index'))

WebUI.click(findTestObject('form_pesanan/buat_pesanan_button'))

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('pesanan_page/pengajuan_pesanan_button'))

//WebUI.waitForElementPresent(findTestObject('pesanan_page/pengajuan_pesanan_button'), GlobalVariable.timeout_E)
WebUI.verifyTextPresent('D Artz Catering', false)

WebUI.click(findTestObject('pesanan_page/list_pesanan'))

WebUI.click(findTestObject('pesanan_detail_page/batal_button'))



