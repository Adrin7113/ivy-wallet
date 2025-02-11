package com.ivy.legacy

import com.ivy.base.util.stringRes
import com.ivy.legacy.datamodel.Loan
import com.ivy.persistence.model.LoanType
import com.ivy.resources.R

fun Loan.humanReadableType(): String {
    return if (type == LoanType.BORROW) {
        stringRes(R.string.borrowed_uppercase)
    } else {
        stringRes(R.string.lent_uppercase)
    }
}