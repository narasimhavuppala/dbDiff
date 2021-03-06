/**
 * Copyright 2011 Vecna Technologies, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
*/

package com.vecna.dbDiff.model;

import java.util.Objects;



/**
 * This class defines the data type of a database column.  It contains integer and String descriptions of a type.
 * @author greg.zheng@vecna.com
 */
public class ColumnType {
  private final int m_type;
  private final String m_typeCode;

  /**
   * @param type an integer description of the data type in SQL
   * @param typeCode a String description of the data type in Java
   */
  public ColumnType(final int type, final String typeCode) {
    m_type = type;
    m_typeCode = typeCode;
  }

  /**
   *
   * {@inheritDoc}
   */
  @Override
  public boolean equals(Object t) {
    if (t == null || getClass() != t.getClass()) {
      return false;
    } else {
      ColumnType other = (ColumnType) t;
      return m_type == other.getType() && Objects.equals(m_typeCode, other.getTypeCode());
    }
  }

  /**
   *
   * {@inheritDoc}
   */
  @Override
  public int hashCode() {
    return Objects.hash(m_type, m_typeCode);
  }

  /**
   * @return an integer that defines a data type, the sql description
   */
  public int getType() {
    return m_type;
  }

  /**
   * @return a String that describes a data type, the Java description
   */
  public String getTypeCode() {
    return m_typeCode;
  }
}
