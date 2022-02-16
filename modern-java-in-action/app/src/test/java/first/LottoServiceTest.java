package first;

import org.junit.jupiter.api.Test;

class LottoServiceTest {

    @Test
    void test_createLottoNumbers(){
        LottoService lottoService = new LottoService();
        LottoTicket lottoTicket = lottoService.createLottoNumbers();

        System.out.println(lottoTicket.getLottoNumbers().size());
        lottoTicket.getLottoNumbers().clear();
        System.out.println(lottoTicket.getLottoNumbers().size());
    }

}