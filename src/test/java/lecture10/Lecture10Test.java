package lecture10;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.baseObject.BaseTest;
import pageObject.herokuapp.NavigationItems;
import pageObject.herokuapp.NavigationPage;
import pageObject.herokuapp.SortableDataTablesPage;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Lecture10Test extends BaseTest {

    @Test
    public void test() {
        new NavigationPage().open().navigateTo(NavigationItems.SORTABLE_DATA_TABLES);
        Map<String, List<String>> mapTableData = new SortableDataTablesPage().checkTableIsDisplayed().clickTableColumn("Last Name").getTableData();
        List<List<String>> tableData = new SortableDataTablesPage().getTableRowsData();
        Assert.assertTrue(tableData.get(2).contains("$100.00"));
        List<String> lastNameData = mapTableData.get("Last Name");
        Assert.assertEquals(lastNameData, lastNameData.stream().sorted().collect(Collectors.toList()));
    }

}
