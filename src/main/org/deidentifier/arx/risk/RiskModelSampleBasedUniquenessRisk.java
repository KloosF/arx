/*
 * ARX: Powerful Data Anonymization
 * Copyright 2012 - 2015 Florian Kohlmayer, Fabian Prasser
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.deidentifier.arx.risk;

/**
 * Class for risks based on uniqueness
 * @author Fabian Prasser
 */
public class RiskModelSampleBasedUniquenessRisk extends RiskModelSampleBased{

    /**
     * Creates a new instance
     * @param classes
     */
    public RiskModelSampleBasedUniquenessRisk(RiskModelEquivalenceClasses classes) {
        super(classes);
    }
    
    /**
     * Returns the fraction of tuples affected by the highest re-identification risk
     * @return
     */
    public double getFractionOfUniqueTuples(){
        return getNumUniqueTuples() / getClasses().getNumTuples();
    }

    /**
     * Returns the number of tuples affected by the lowest re-identification risk
     * @return
     */
    public double getNumUniqueTuples(){
        int[] classes = getClasses().getEquivalenceClasses();
        return classes[0] == 1 ? classes[1] : 0;
    }
}
