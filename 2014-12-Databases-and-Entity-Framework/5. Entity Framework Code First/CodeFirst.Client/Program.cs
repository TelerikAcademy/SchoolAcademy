namespace CodeFirst.Client
{
    using System;

    using CodeFirst.Data;
    using CodeFirst.Data.Migrations;
    using CodeFirst.Models;
    using System.Data.Entity;

    internal class Program
    {
        internal static void Main()
        {
            Database.SetInitializer(new MigrateDatabaseToLatestVersion<ForumContext, Configuration>());

            var db = new ForumContext();

            var category = new Category { Parent = null, Name = "Database course", };
            db.Categories.Add(category);

            var post = new Post
                           {
                               Title = "Срока на домашните",
                               Content = "Моля удължете срока на домашните",
                               Type = PostType.Normal,
                               Category = category,
                           };
            post.Tags.Add(new Tag { Text = "домашни" });
            post.Tags.Add(new Tag { Text = "срок" });
            db.Posts.Add(post);

            db.SaveChanges();

            Console.WriteLine("Ready!");
            Console.ReadLine();
        }
    }
}