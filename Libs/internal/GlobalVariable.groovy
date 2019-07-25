package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


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
    public static Object USERNAME
     
    /**
     * <p></p>
     */
    public static Object PASSWORD
     
    /**
     * <p></p>
     */
    public static Object NAME
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            URL = selectedVariables['URL']
            USERNAME = selectedVariables['USERNAME']
            PASSWORD = selectedVariables['PASSWORD']
            NAME = selectedVariables['NAME']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
