import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String json = "{\n" +
                "\"LatestModified\": 1692916134499,\n" +
                "\"Results\": 10,\n" +
                "\"Error\": \"\",\n" +
                "\"Data\": {\n" +
                "\"Inv_ObjectiveStrategy\": {\n" +
                "\"metadata\": {\n" +
                "\"path\": \"/content-fragments/caas/cmda/fundcontent/fund_descriptions/inv_obj_strategy/vf_inv_obj_strategy/U_Z/ultra-short_bond_etf_0931\",\n" +
                "\"variation\": \"master\"\n" +
                "},\n" +
                "\"content\": {\n" +
                "\"investment_strategy\": \"<p>The fund invests in a diversified portfolio of high-quality and, to a lesser extent, medium-quality fixed income securities. High-quality fixed income securities are those rated the equivalent of A3 or better by Moody&#8217;s Investors Service, Inc. (Moody&#8217;s) or another independent rating agency or, if unrated, are determined to be of comparable quality by the fund&#8217;s advisor. Medium-quality fixed income securities are those rated the equivalent of Baa1, Baa2, or Baa3 by Moody&#8217;s or another independent rating agency or, if unrated, are determined to be of comparable quality by the fund&#8217;s advisor. The fund is expected to maintain a dollar-weighted average maturity of 0 to 2 years. Under normal circumstances, the fund will invest at least 80% of its assets in fixed income securities.</p> <p></p>\",\n" +
                "\"FundName\": \"ultra-short_bond_etf_0931\",\n" +
                "\"investment_objective\": \"<p>Vanguard Ultra-Short Bond ETF seeks to provide current income while maintaining limited price volatility.</p> <p></p>\"\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "}";
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
            Gson gson = new Gson();
            JSONResponse response = gson.fromJson(json, JSONResponse.class);

            Content content = response.Data.invObjectiveStrategy.content;
            System.out.println("Investment Strategy: " + content.investmentStrategy);
            System.out.println("Fund Name: " + content.FundName);
            System.out.println("Investment Objective: " + content.investmentObjective);


        }
    }
}
        class Metadata {
            String path;
            String variation;
        }

        class Content {
            @SerializedName("investment_strategy")
            String investmentStrategy;
            String FundName;
            @SerializedName("investment_objective")
            String investmentObjective;
        }

        class InvObjectiveStrategy {
            Metadata metadata;
            Content content;
        }

        class Data {
            @SerializedName("Inv_ObjectiveStrategy")
            InvObjectiveStrategy invObjectiveStrategy;
        }

        class JSONResponse {
            long LatestModified;
            int Results;
            String Error;
            Data Data;
        }
