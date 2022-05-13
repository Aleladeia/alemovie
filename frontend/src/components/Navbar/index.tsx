import { ReactComponent as GithubIcon } from 'assets/img/github.svg';
import './styles.css';

function Navbar() {

    return (
        <header>
            <nav className="container">
                <div className="alemovie-nav-content">
                    <h1>ALEMovie</h1>
                    <a href="https://github.com/Aleladeia">
                        <div className="alemovie-contact-container">
                            <GithubIcon />
                            <p className="alemovie-contatct-link">/Aleladeia</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;