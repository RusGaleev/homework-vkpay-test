import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun getCommissionAmount() {
        val commissionAmount = 0
        assertEquals( 0, commissionAmount)
    }

    @Test
    fun setCommissionAmount() {
        val commissionAmount = 0
        assertEquals( 0, commissionAmount)
    }

    @Test
    fun doTransferVkPay() {
        //arrange
        val card: String = "VK Pay"
        val previousTransfer: Int = 100
        val transfer: Int = 100

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( true, result)
    }

    @Test
    fun doTransferMaster() {
        //arrange
        val card: String = "MasterCard"
        val previousTransfer: Int = 10000
        val transfer: Int = 10000

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( true, result)
    }

    @Test
    fun doTransferMir() {
        //arrange
        val card: String = "Mir"
        val previousTransfer: Int = 10000
        val transfer: Int = 10000

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( true, result)
    }

    @Test
    fun doTransferVisa() {
        //arrange
        val card: String = "Visa"
        val previousTransfer: Int = 900000
        val transfer: Int = 900000

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( true, result)
    }

    @Test
    fun doTransferMaestro() {
        //arrange
        val card: String = "MasterCard"
        val previousTransfer: Int = 0
        val transfer: Int = 75_000_00

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( true, result)
        assertEquals( 0, commissionAmount)
    }

    @Test
    fun doTransferVkPayFailurePreviousTransfer() {
        //arrange
        val card: String = "VK Pay"
        val previousTransfer: Int = 90_000_00
        val transfer: Int = 90_000_00

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( false, result)
    }

    @Test
    fun doTransferVkPayFailureTransfer() {
        //arrange
        val card: String = "VK Pay"
        val previousTransfer: Int = 0
        val transfer: Int = 16_000_00

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( false, result)
    }

    @Test
    fun doTransferFailureTransfer() {
        //arrange
        val card: String = "Visa"
        val previousTransfer: Int = 0
        val transfer: Int = 160_000_00

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( false, result)
    }

    @Test
    fun doTransferFailurePreviousTransfer() {
        //arrange
        val card: String = "Visa"
        val previousTransfer: Int = 600_000_00
        val transfer: Int = 10_000_00

        //act
        val result = doTransfer(
            card = card,
            previousTransferAmount = previousTransfer,
            transferAmount = transfer
        )

        //assert
        assertEquals( false, result)
    }
}