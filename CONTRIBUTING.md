# Contributing

When contributing to this repository, please first discuss the change you wish to make via issue,
email, or any other method with the owners of this repository before making a change. 

Please note we have a code of conduct, please follow it in all your interactions with the project.

## Pull Request Process

Follow theses steps to make a Pull Request:

### Only the first time:
* Fork the project:
```
Click on the fork button on the top right of the screen
```
* Clone your forked project:
```
git clone <repo_url>
```
* Link your repo with the original repo in order to keep it up to date:
```
git remote add upstream https://github.com/shoxtrem/RPGQuiz.git
```
  
### To keep your repo up to date with the original repo. So to do before working on a new contribution.
* Ensure that you have the most recent version of the original repo:
```
git fetch upstream
git branch -va
```
* Update your master to the last version
```
git checkout master
git merge upstream/master
```
  
### To do your contribution
* Create a new branch where you will make your contribution and change your working directory on it:
```
git checkout master
git branch <branch_name>
git checkout <branch_name>
```
* Make your contribution, **following the commit advices below**

### Submit a Pull Request
* Once you finished your contribution, check that your branch include the lasts modifications of the original repo:
```
git fetch upstream
git checkout master
git merge upstream/master
git checkout newfeature
git rebase master
```
* Commit and push all your modifications in your GitHub repo.
* On GitHub, select your development branch and click the Pull Request button

## Commit Message Style Guide

We will follow the Udacity [style guide](http://udacity.github.io/git-styleguide/).
To resume, the differents types are :
* feat: a new feature
* fix: a bug fix
* docs: changes to documentation
* style: formatting, missing semi colons, etc; no code change
* refactor: refactoring production code
* test: adding tests, refactoring test; no production code change
* chore: updating build tasks, package manager configs, etc; no production code change

## Code of Conduct

### Our Pledge

In the interest of fostering an open and welcoming environment, we as
contributors and maintainers pledge to making participation in our project and
our community a harassment-free experience for everyone, regardless of age, body
size, disability, ethnicity, gender identity and expression, level of experience,
nationality, personal appearance, race, religion, or sexual identity and
orientation.

### Our Standards

Examples of behavior that contributes to creating a positive environment
include:

* Using welcoming and inclusive language
* Being respectful of differing viewpoints and experiences
* Gracefully accepting constructive criticism
* Focusing on what is best for the community
* Showing empathy towards other community members

Examples of unacceptable behavior by participants include:

* The use of sexualized language or imagery and unwelcome sexual attention or
advances
* Trolling, insulting/derogatory comments, and personal or political attacks
* Public or private harassment
* Publishing others' private information, such as a physical or electronic
  address, without explicit permission
* Other conduct which could reasonably be considered inappropriate in a
  professional setting

### Our Responsibilities

Project maintainers are responsible for clarifying the standards of acceptable
behavior and are expected to take appropriate and fair corrective action in
response to any instances of unacceptable behavior.

Project maintainers have the right and responsibility to remove, edit, or
reject comments, commits, code, wiki edits, issues, and other contributions
that are not aligned to this Code of Conduct, or to ban temporarily or
permanently any contributor for other behaviors that they deem inappropriate,
threatening, offensive, or harmful.

### Scope

This Code of Conduct applies both within project spaces and in public spaces
when an individual is representing the project or its community. Examples of
representing a project or community include using an official project e-mail
address, posting via an official social media account, or acting as an appointed
representative at an online or offline event. Representation of a project may be
further defined and clarified by project maintainers.

### Enforcement

Instances of abusive, harassing, or otherwise unacceptable behavior may be
reported by contacting the project team at shoxtrem@stangame.com. All
complaints will be reviewed and investigated and will result in a response that
is deemed necessary and appropriate to the circumstances. The project team is
obligated to maintain confidentiality with regard to the reporter of an incident.
Further details of specific enforcement policies may be posted separately.

Project maintainers who do not follow or enforce the Code of Conduct in good
faith may face temporary or permanent repercussions as determined by other
members of the project's leadership.

### Attribution

This Code of Conduct is adapted from the [Contributor Covenant][homepage], version 1.4,
available at [http://contributor-covenant.org/version/1/4][version]

[homepage]: http://contributor-covenant.org
[version]: http://contributor-covenant.org/version/1/4/
