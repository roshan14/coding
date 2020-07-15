/* Problem : word search

* List of inventories :
     1. Apple Iphone Xs 256 GB
     2. Apple I phone case cover
     3. Apple Ipad
     4. Apple
Input
# case cover
# apple Iphone

 */

public class WordSearch {
    public static void main(String[] args) {

    }
}
/*
# whole words
        for i in range(len(inventories)):
        if(inputStr == inventories[i].lower()):
        whole_match.append(inventories[i])

        # partial
        for i in range(len(parts)):
        for j in range(len(inventories)):
        if (parts[i] in inventories[j].lower() and (inventories[j] not in whole_match) and (inventories[j] in matchList)):
        whole_match.append(inventories[j])

        elif (parts[i] in inventories[j].lower() and (inventories[j] not in whole_match)):
        matchList.append(inventories[j])

        print_list = []

        for i in range(len(whole_match)):
        print_list.append(whole_match[i])

        for i in range(len(matchList)):
        if (matchList[i] not in print_list):
        print_list.append(matchList[i])

        for i in range(len(print_list)):
        print(print_list[i])

        # alternate solution : Create dictionary and sort in desc order*/
