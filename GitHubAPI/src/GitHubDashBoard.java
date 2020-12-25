import org.kohsuke.github.*;

import java.util.List;

public class GitHubDashBoard
{
    public static void main(String[] args) throws Exception
    {
        GitHub github = new GitHubBuilder().withOAuthToken("token").build();
        GHRepository repo = github.getRepository("whiteship/live-study");
        List<GHIssue> ghIssues = repo.getIssues(GHIssueState.ALL);

        for (int i = 0; i < ghIssues.size(); i++)
        {

        }
    }
}