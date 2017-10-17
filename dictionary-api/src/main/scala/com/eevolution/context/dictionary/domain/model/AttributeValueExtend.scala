package com.eevolution.context.dictionary.domain.model

import ai.x.play.json.Jsonx
import com.eevolution.context.dictionary.api.{ActiveEnabled, DomainModel, Identifiable, Traceable}
import org.joda.time.DateTime
/**
  * Copyright (C) 2003-2017, e-Evolution Consultants S.A. , http://www.e-evolution.com
  * This program is free software: you can redistribute it and/or modify
  * it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or
  * (at your option) any later version.
  * This program is distributed in the hope that it will be useful,
  * but WITHOUT ANY WARRANTY; without even the implied warranty of
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
  * GNU General Public License for more details.
  * You should have received a copy of the GNU General Public License
  * along with this program.  If not, see <http://www.gnu.org/licenses/>.
  * Email: eduardo.moreno@e-evolution.com, http://www.e-evolution.com , http://github.com/e-Evolution
  * Created by eduardo.moreno@e-evolution.com , www.e-evolution.com
  */
/**
  * Attribute Value Entity
  * @param attributeValueExtendId Attribute Value Extend ID
  * @param recordId Record ID
  * @param vNumber V Number
  * @param vDate V Date
  * @param vString V String
  * @param uuId UU ID
  */

case class AttributeValueExtend(attributeValueExtendId: Int,
                                attributeId: Int,
                                isActive: Boolean,
                                created: DateTime,
                                createdBy: Int,
                                updated: DateTime,
                                updatedBy: Int,
                                recordId: Int,
                                vNumber: Option[Int],
                                vDate: Option[DateTime],
                                vString: Option[String],
                                uuId: Option[String]
                          ) extends DomainModel

  with ActiveEnabled
  with Identifiable
  with Traceable {
  override type ActiveEnabled = this.type
  override type Identifiable = this.type
  override type Traceable = this.type

  override def Id: Int = attributeValueExtendId

  override val entityName: String = "AD_Attribute_Value"
  override val identifier: String = "AD_Attribute_Value_ID"

}

object AttributeValueExtend {
  implicit lazy val jsonFormat = Jsonx.formatCaseClass[AttributeValueExtend]
  def create(attributeValueExtendId: Int,
             attributeId: Int,
             isActive: Boolean,
             created: DateTime,
             createdBy: Int,
             updated: DateTime,
             updatedBy: Int,
             recordId: Int,
             vNumber: Int,
             vDate: DateTime,
             vString: String,
             uuId: String) = AttributeValueExtend(attributeValueExtendId, attributeId, isActive, created, createdBy,
    updated, updatedBy, recordId, None, None, None, None)
}