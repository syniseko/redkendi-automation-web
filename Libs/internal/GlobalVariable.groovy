package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object URL
     
    /**
     * <p></p>
     */
    public static Object timeout
     
    /**
     * <p></p>
     */
    public static Object URL_Pemesanan
     
    /**
     * <p></p>
     */
    public static Object timeout_E
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['URL' : 'www.redkendi.com', 'timeout' : 0, 'URL_Pemesanan' : 'https://customer.redkendi.com/package-recommendation', 'timeout_E' : 10])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        URL = selectedVariables["URL"]
        timeout = selectedVariables["timeout"]
        URL_Pemesanan = selectedVariables["URL_Pemesanan"]
        timeout_E = selectedVariables["timeout_E"]
        
    }
}
