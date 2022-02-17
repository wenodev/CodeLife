package first;

import java.util.List;

public class LottoService {
    public LottoTicket createLottoNumbers(List<Integer> numbers){
        LottoTicket lottoTicket = new LottoTicket(numbers);
        return lottoTicket;
    }
}
