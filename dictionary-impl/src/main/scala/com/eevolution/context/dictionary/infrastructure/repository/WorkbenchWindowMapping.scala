package com.eevolution.context.dictionary.infrastructure.repository

import com.eevolution.context.dictionary.domain.model.WorkbenchWindow
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
  * Created by emeris.hernandez@e-evolution.com , www.e-evolution.com on 30/10/17.
  */

/**
  * Workbench Window Mapping
  */

trait WorkbenchWindowMapping {
  val queryWorkbenchWindow = quote {
    querySchema[WorkbenchWindow]("AD_WorkbenchWindow",
      _.workbenchWindowId -> "AD_WorkbenchWindow_ID",
      _.isActive-> "IsActive",
      _.tenantId-> "AD_Client_ID",
      _.organizationId -> "AD_Org_ID" ,
      _.created-> "Created",
      _.createdBy-> "CreatedBy",
      _.updated-> "Updated",
      _.updatedBy-> "UpdatedBy",
      _.workbenchId-> "AD_Workbench_ID",
      _.seqNo-> "SeqNo",
      _.isPrimary-> "IsPrimary",
      _.windowId-> "AD_Window_ID",
      _.formId-> "AD_Form_ID",
      _.processId-> "AD_Process_ID",
      _.taskId-> "AD_Task_ID",
      _.entityType-> "EntityType",
      _.uuid-> "UUID")
  }
}
