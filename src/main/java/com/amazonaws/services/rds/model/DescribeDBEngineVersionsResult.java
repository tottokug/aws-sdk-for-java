/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.rds.model;
import java.io.Serializable;

/**
 * <p>
 * Contains the result of a successful invocation of the DescribeDBEngineVersions action.
 * </p>
 */
public class DescribeDBEngineVersionsResult  implements Serializable  {

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     */
    private String marker;

    /**
     * A list of <code>DBEngineVersion</code> elements.
     */
    private java.util.List<DBEngineVersion> dBEngineVersions;

    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional pagination token provided by a previous request. If this
     * parameter is specified, the response includes only records beyond the
     * marker, up to the value specified by <code>MaxRecords</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional pagination token provided by a previous request. If this
     *         parameter is specified, the response includes only records beyond the
     *         marker, up to the value specified by <code>MaxRecords</code>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }
    
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     *
     * @return A list of <code>DBEngineVersion</code> elements.
     */
    public java.util.List<DBEngineVersion> getDBEngineVersions() {
        
        if (dBEngineVersions == null) {
            dBEngineVersions = new java.util.ArrayList<DBEngineVersion>();
        }
        return dBEngineVersions;
    }
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     *
     * @param dBEngineVersions A list of <code>DBEngineVersion</code> elements.
     */
    public void setDBEngineVersions(java.util.Collection<DBEngineVersion> dBEngineVersions) {
        if (dBEngineVersions == null) {
            this.dBEngineVersions = null;
            return;
        }

        java.util.List<DBEngineVersion> dBEngineVersionsCopy = new java.util.ArrayList<DBEngineVersion>(dBEngineVersions.size());
        dBEngineVersionsCopy.addAll(dBEngineVersions);
        this.dBEngineVersions = dBEngineVersionsCopy;
    }
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBEngineVersions A list of <code>DBEngineVersion</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsResult withDBEngineVersions(DBEngineVersion... dBEngineVersions) {
        if (getDBEngineVersions() == null) setDBEngineVersions(new java.util.ArrayList<DBEngineVersion>(dBEngineVersions.length));
        for (DBEngineVersion value : dBEngineVersions) {
            getDBEngineVersions().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>DBEngineVersion</code> elements.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param dBEngineVersions A list of <code>DBEngineVersion</code> elements.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeDBEngineVersionsResult withDBEngineVersions(java.util.Collection<DBEngineVersion> dBEngineVersions) {
        if (dBEngineVersions == null) {
            this.dBEngineVersions = null;
        } else {
            java.util.List<DBEngineVersion> dBEngineVersionsCopy = new java.util.ArrayList<DBEngineVersion>(dBEngineVersions.size());
            dBEngineVersionsCopy.addAll(dBEngineVersions);
            this.dBEngineVersions = dBEngineVersionsCopy;
        }

        return this;
    }
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");    	
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");    	
        if (getDBEngineVersions() != null) sb.append("DBEngineVersions: " + getDBEngineVersions() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getDBEngineVersions() == null) ? 0 : getDBEngineVersions().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDBEngineVersionsResult == false) return false;
        DescribeDBEngineVersionsResult other = (DescribeDBEngineVersionsResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getDBEngineVersions() == null ^ this.getDBEngineVersions() == null) return false;
        if (other.getDBEngineVersions() != null && other.getDBEngineVersions().equals(this.getDBEngineVersions()) == false) return false; 
        return true;
    }
    
}
    