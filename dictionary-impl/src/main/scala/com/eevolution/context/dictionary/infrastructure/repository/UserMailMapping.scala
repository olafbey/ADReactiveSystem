package com.eevolution.context.dictionary.infrastructure.repository

import com.eevolution.context.dictionary.domain.model.UserMail
import com.eevolution.context.dictionary.infrastructure.db.DbContext._

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
  * Email: emeris.hernandez@e-evolution.com, http://www.e-evolution.com , http://github.com/EmerisScala
  * Created by emeris.hernandez@e-evolution.com , www.e-evolution.com on 27/10/17.
  */

/**
  * User Mail Mapping
  */

trait UserMailMapping {
  val queryUserMail = quote {
    querySchema[UserMail]("AD_UserMail",
      _.userMailId-> "AD_UserMail_ID",
      _.tenantId-> "AD_Client_ID",
      _.organizationId-> "AD_Org_ID",
      _.isActive-> "IsActive",
      _.created-> "Created",
      _.createdBy-> "CreatedBy",
      _.updated-> "Updated",
      _.updatedBy-> "UpdatedBy",
      _.userId-> "AD_User_ID",
      _.mailTextId-> "R_MailText_ID",
      _.mailMsgId-> "W_MailMsg_ID",
      _.messageId-> "MessageID",
      _.deliveryConfirmation-> "DeliveryConfirmation",
      _.isDelivered-> "IsDelivered",
      _.subject-> "Subject",
      _.mailText-> "MailText",
      _.uuid-> "UUID")
  }
}
