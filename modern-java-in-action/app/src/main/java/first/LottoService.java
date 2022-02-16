package first;

import java.util.ArrayList;
import java.util.List;

public class LottoService {
    public LottoTicket createLottoNumbers(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        LottoTicket lottoTicket = new LottoTicket(numbers);
        return lottoTicket;
    }
}
