# Exercise: Getting used to git

This repository contains an example Java project. Your task is to use git tools to get your own copy on your development machine, make a change and then use git tools to update the version stored on the GitHUb server.

## Part 1: Set up this computer to use git and GitHub.

You will need to do this for every computer you wish to use on this module

1. Make sure that the **git** command and its friends are in your command path. The easiest way to do this is to use **Git Bash**: select your Eclipse workspace in the file browser, then right click and select "Git Bash Here". When the Git Bash command window appears, type ``git --help`` and you should see a page or two of "help".
2. Tell git who you are: ```
	git config --global user.name "Your Name"
	git config --global user.email "yourid@uos.ac.uk" ```
2. Create an ssh key pair and share the public key with GitHub. In the Git Bash window, type ``ssh-keygen`` and follow the instructions. If you wish to be extra secure you can enter a passphrase when prompted, but bear in mind that you will need to enter this every time you transfer anything to or from GitHub. I usually leave this empty.
3. Display your public key using ``cat ~/.ssh/id_rsa.pub`` and copy the text to your clipboard
4. Click on your profile icon on the top-right of this GitHub page to show a drop-down list. right-click on **Settings** and open in a new browser tab so you can still read these instructions.
5. Go to the new tab and click **SSH and GPG keys** from the list on the left, then click the green button labelled **New SSH Key**.
6. Type a name for this computer into the Title box, paste your copied SSH key into the Key box, then click the green **Add SSH key** button.

If you did all that correctly, you have now set up this computer to use git, and authorised it to access your GitHub account

2. Use ``git clone`` to get a duplicate (clone) of the remote repository on your development machine.
